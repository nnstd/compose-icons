package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.AccountAlert: ImageVector
    get() {
        if (_AccountAlert != null) {
            return _AccountAlert!!
        }
        _AccountAlert = ImageVector.Builder(
            name = "AccountAlert",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10f, 4f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14f, 8f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10f, 12f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 8f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10f, 4f)
                moveTo(10f, 14f)
                curveTo(14.42f, 14f, 18f, 15.79f, 18f, 18f)
                verticalLineTo(20f)
                horizontalLineTo(2f)
                verticalLineTo(18f)
                curveTo(2f, 15.79f, 5.58f, 14f, 10f, 14f)
                moveTo(20f, 12f)
                verticalLineTo(7f)
                horizontalLineTo(22f)
                verticalLineTo(13f)
                horizontalLineTo(20f)
                moveTo(20f, 17f)
                verticalLineTo(15f)
                horizontalLineTo(22f)
                verticalLineTo(17f)
                horizontalLineTo(20f)
                close()
            }
        }.build()

        return _AccountAlert!!
    }

@Suppress("ObjectPropertyName")
private var _AccountAlert: ImageVector? = null
