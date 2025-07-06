package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.AccountSupervisorOutline: ImageVector
    get() {
        if (_AccountSupervisorOutline != null) {
            return _AccountSupervisorOutline!!
        }
        _AccountSupervisorOutline = ImageVector.Builder(
            name = "AccountSupervisorOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.5f, 15.5f)
                curveTo(18.22f, 15.5f, 20.25f, 16.3f, 20.5f, 16.78f)
                verticalLineTo(17.5f)
                horizontalLineTo(12.5f)
                verticalLineTo(16.78f)
                curveTo(12.75f, 16.3f, 14.78f, 15.5f, 16.5f, 15.5f)
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
                verticalLineTo(17.5f)
                horizontalLineTo(3.5f)
                verticalLineTo(16.5f)
                curveTo(3.5f, 15.87f, 6.29f, 14.34f, 9.82f, 14.5f)
                arcTo(5.12f, 5.12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.37f, 13.25f)
                arcTo(12.28f, 12.28f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 13f)
                moveTo(9f, 6.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 7.5f, 8f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9f, 6.5f)
                moveTo(9f, 5f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = true, isPositiveArc = false, 12f, 8f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 5f)
                moveTo(16.5f, 8.5f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 15.5f, 9.5f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16.5f, 8.5f)
                moveTo(16.5f, 7f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 19f, 9.5f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16.5f, 7f)
                close()
            }
        }.build()

        return _AccountSupervisorOutline!!
    }

@Suppress("ObjectPropertyName")
private var _AccountSupervisorOutline: ImageVector? = null
