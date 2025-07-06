package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.AccountSupervisor: ImageVector
    get() {
        if (_AccountSupervisor != null) {
            return _AccountSupervisor!!
        }
        _AccountSupervisor = ImageVector.Builder(
            name = "AccountSupervisor",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.5f, 12f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 9.5f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16.5f, 7f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14f, 9.5f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16.5f, 12f)
                moveTo(9f, 11f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 8f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 5f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 8f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 11f)
                moveTo(16.5f, 14f)
                curveTo(14.67f, 14f, 11f, 14.92f, 11f, 16.75f)
                verticalLineTo(19f)
                horizontalLineTo(22f)
                verticalLineTo(16.75f)
                curveTo(22f, 14.92f, 18.33f, 14f, 16.5f, 14f)
                moveTo(9f, 13f)
                curveTo(6.67f, 13f, 2f, 14.17f, 2f, 16.5f)
                verticalLineTo(19f)
                horizontalLineTo(9f)
                verticalLineTo(16.75f)
                curveTo(9f, 15.9f, 9.33f, 14.41f, 11.37f, 13.28f)
                curveTo(10.5f, 13.1f, 9.66f, 13f, 9f, 13f)
                close()
            }
        }.build()

        return _AccountSupervisor!!
    }

@Suppress("ObjectPropertyName")
private var _AccountSupervisor: ImageVector? = null
