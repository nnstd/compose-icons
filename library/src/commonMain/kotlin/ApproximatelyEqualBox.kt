package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ApproximatelyEqualBox: ImageVector
    get() {
        if (_ApproximatelyEqualBox != null) {
            return _ApproximatelyEqualBox!!
        }
        _ApproximatelyEqualBox = ImageVector.Builder(
            name = "ApproximatelyEqualBox",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 3f)
                horizontalLineTo(5f)
                curveTo(3.9f, 3f, 3f, 3.9f, 3f, 5f)
                verticalLineTo(19f)
                curveTo(3f, 20.1f, 3.9f, 21f, 5f, 21f)
                horizontalLineTo(19f)
                curveTo(20.1f, 21f, 21f, 20.1f, 21f, 19f)
                verticalLineTo(5f)
                curveTo(21f, 3.9f, 20.1f, 3f, 19f, 3f)
                moveTo(9.3f, 8.2f)
                curveTo(10.6f, 8.2f, 11.4f, 8.7f, 12.1f, 9f)
                curveTo(12.7f, 9.3f, 13.4f, 9.7f, 14.5f, 9.7f)
                curveTo(15.5f, 9.7f, 16.5f, 9f, 17f, 8.5f)
                lineTo(17.8f, 9.8f)
                curveTo(17.1f, 10.6f, 15.8f, 11.4f, 14.4f, 11.4f)
                curveTo(13.1f, 11.4f, 12.3f, 10.9f, 11.7f, 10.6f)
                curveTo(11.1f, 10.3f, 10.3f, 9.9f, 9.2f, 9.9f)
                curveTo(8.2f, 9.9f, 7.2f, 10.6f, 6.7f, 11.1f)
                lineTo(6f, 9.8f)
                curveTo(6.7f, 9f, 8f, 8.2f, 9.3f, 8.2f)
                moveTo(14.6f, 15.8f)
                curveTo(13.3f, 15.8f, 12.5f, 15.3f, 11.8f, 15f)
                curveTo(11.2f, 14.7f, 10.4f, 14.3f, 9.3f, 14.3f)
                curveTo(8.3f, 14.3f, 7.3f, 15f, 6.8f, 15.5f)
                lineTo(6f, 14.1f)
                curveTo(6.7f, 13.3f, 8f, 12.5f, 9.3f, 12.5f)
                curveTo(10.6f, 12.5f, 11.4f, 13f, 12.1f, 13.3f)
                curveTo(12.7f, 13.6f, 13.4f, 14f, 14.6f, 14f)
                curveTo(15.6f, 14f, 16.6f, 13.3f, 17.1f, 12.8f)
                lineTo(17.9f, 14.1f)
                curveTo(17.3f, 15f, 16f, 15.8f, 14.6f, 15.8f)
                close()
            }
        }.build()

        return _ApproximatelyEqualBox!!
    }

@Suppress("ObjectPropertyName")
private var _ApproximatelyEqualBox: ImageVector? = null
