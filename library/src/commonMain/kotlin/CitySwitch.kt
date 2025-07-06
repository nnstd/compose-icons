package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CitySwitch: ImageVector
    get() {
        if (_CitySwitch != null) {
            return _CitySwitch!!
        }
        _CitySwitch = ImageVector.Builder(
            name = "CitySwitch",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 15f)
                verticalLineTo(9f)
                horizontalLineTo(15f)
                verticalLineTo(3f)
                lineTo(12f, 0f)
                lineTo(9f, 3f)
                verticalLineTo(5f)
                horizontalLineTo(3f)
                verticalLineTo(15f)
                horizontalLineTo(21f)
                moveTo(19f, 13f)
                horizontalLineTo(17f)
                verticalLineTo(11f)
                horizontalLineTo(19f)
                verticalLineTo(13f)
                moveTo(11f, 5f)
                verticalLineTo(3f)
                horizontalLineTo(13f)
                verticalLineTo(5f)
                horizontalLineTo(11f)
                moveTo(11f, 9f)
                verticalLineTo(7f)
                horizontalLineTo(13f)
                verticalLineTo(9f)
                horizontalLineTo(11f)
                moveTo(11f, 13f)
                verticalLineTo(11f)
                horizontalLineTo(13f)
                verticalLineTo(13f)
                horizontalLineTo(11f)
                moveTo(7f, 9f)
                horizontalLineTo(5f)
                verticalLineTo(7f)
                horizontalLineTo(7f)
                verticalLineTo(9f)
                moveTo(7f, 13f)
                horizontalLineTo(5f)
                verticalLineTo(11f)
                horizontalLineTo(7f)
                verticalLineTo(13f)
                moveTo(9f, 17f)
                verticalLineTo(19f)
                horizontalLineTo(15f)
                verticalLineTo(17f)
                lineTo(18f, 20f)
                lineTo(15f, 23f)
                verticalLineTo(21f)
                horizontalLineTo(9f)
                verticalLineTo(23f)
                lineTo(6f, 20f)
                lineTo(9f, 17f)
                close()
            }
        }.build()

        return _CitySwitch!!
    }

@Suppress("ObjectPropertyName")
private var _CitySwitch: ImageVector? = null
