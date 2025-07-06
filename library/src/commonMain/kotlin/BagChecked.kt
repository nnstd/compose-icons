package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BagChecked: ImageVector
    get() {
        if (_BagChecked != null) {
            return _BagChecked!!
        }
        _BagChecked = ImageVector.Builder(
            name = "BagChecked",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 19f)
                horizontalLineTo(2f)
                verticalLineTo(21f)
                horizontalLineTo(22f)
                verticalLineTo(19f)
                moveTo(4f, 15f)
                curveTo(4f, 15.5f, 4.2f, 16f, 4.6f, 16.4f)
                curveTo(5f, 16.8f, 5.5f, 17f, 6f, 17f)
                verticalLineTo(6f)
                curveTo(5.5f, 6f, 5f, 6.2f, 4.6f, 6.6f)
                curveTo(4.2f, 7f, 4f, 7.5f, 4f, 8f)
                verticalLineTo(15f)
                moveTo(13.5f, 6f)
                horizontalLineTo(10.5f)
                curveTo(10.5f, 5.6f, 10.6f, 5.2f, 10.9f, 4.9f)
                curveTo(11.2f, 4.6f, 11.5f, 4.5f, 12f, 4.5f)
                curveTo(12.4f, 4.5f, 12.8f, 4.6f, 13.1f, 4.9f)
                curveTo(13.3f, 5.2f, 13.5f, 5.6f, 13.5f, 6f)
                moveTo(7f, 6f)
                verticalLineTo(17f)
                horizontalLineTo(17f)
                verticalLineTo(6f)
                horizontalLineTo(15f)
                curveTo(15f, 5.2f, 14.7f, 4.5f, 14.1f, 3.9f)
                reflectiveCurveTo(12.8f, 3f, 12f, 3f)
                curveTo(11.2f, 3f, 10.5f, 3.3f, 9.9f, 3.9f)
                curveTo(9.3f, 4.5f, 9f, 5.2f, 9f, 6f)
                horizontalLineTo(7f)
                moveTo(18f, 17f)
                curveTo(18.5f, 17f, 19f, 16.8f, 19.4f, 16.4f)
                curveTo(19.8f, 16f, 20f, 15.5f, 20f, 15f)
                verticalLineTo(8f)
                curveTo(20f, 7.5f, 19.8f, 7f, 19.4f, 6.6f)
                curveTo(19f, 6.2f, 18.5f, 6f, 18f, 6f)
                verticalLineTo(17f)
                close()
            }
        }.build()

        return _BagChecked!!
    }

@Suppress("ObjectPropertyName")
private var _BagChecked: ImageVector? = null
