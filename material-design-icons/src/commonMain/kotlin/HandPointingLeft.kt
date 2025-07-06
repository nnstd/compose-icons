package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.HandPointingLeft: ImageVector
    get() {
        if (_HandPointingLeft != null) {
            return _HandPointingLeft!!
        }
        _HandPointingLeft = ImageVector.Builder(
            name = "HandPointingLeft",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3f, 9f)
                horizontalLineTo(13f)
                lineTo(11.31f, 5.8f)
                lineTo(11.28f, 5.58f)
                curveTo(11.28f, 5.29f, 11.4f, 5.03f, 11.6f, 4.84f)
                lineTo(12.37f, 4.1f)
                lineTo(16.57f, 9f)
                curveTo(16.84f, 9.26f, 17f, 9.61f, 17f, 10f)
                verticalLineTo(16.5f)
                curveTo(17f, 17.27f, 16.3f, 18f, 15.5f, 18f)
                horizontalLineTo(11.14f)
                curveTo(10.53f, 18f, 10f, 17.65f, 9.8f, 17.15f)
                lineTo(7.6f, 12.21f)
                lineTo(7.47f, 11f)
                horizontalLineTo(3f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 10f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 9f)
                moveTo(19f, 18f)
                verticalLineTo(10f)
                horizontalLineTo(22f)
                verticalLineTo(18f)
                horizontalLineTo(19f)
                close()
            }
        }.build()

        return _HandPointingLeft!!
    }

@Suppress("ObjectPropertyName")
private var _HandPointingLeft: ImageVector? = null
