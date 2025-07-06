package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Zend: ImageVector
    get() {
        if (_Zend != null) {
            return _Zend!!
        }
        _Zend = ImageVector.Builder(
            name = "Zend",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11.28f, 9.81f)
                curveTo(11.28f, 9.81f, 11.28f, 7f, 14.09f, 7f)
                horizontalLineTo(22.5f)
                curveTo(22.5f, 7f, 22.5f, 9.81f, 19.71f, 9.81f)
                horizontalLineTo(11.28f)
                moveTo(11.28f, 13.41f)
                curveTo(11.28f, 13.41f, 11.28f, 10.6f, 14.09f, 10.6f)
                horizontalLineTo(18.31f)
                curveTo(18.31f, 10.6f, 18.31f, 13.41f, 15.5f, 13.41f)
                horizontalLineTo(11.28f)
                moveTo(11.28f, 17f)
                curveTo(11.28f, 17f, 11.28f, 14.19f, 14.09f, 14.19f)
                horizontalLineTo(15.5f)
                curveTo(15.5f, 14.19f, 15.5f, 17f, 12.68f, 17f)
                horizontalLineTo(11.28f)
                moveTo(10.46f, 14.8f)
                verticalLineTo(17f)
                horizontalLineTo(1.58f)
                lineTo(7.3f, 9.21f)
                horizontalLineTo(2.4f)
                verticalLineTo(7f)
                horizontalLineTo(11.66f)
                lineTo(5.96f, 14.8f)
                horizontalLineTo(10.46f)
                close()
            }
        }.build()

        return _Zend!!
    }

@Suppress("ObjectPropertyName")
private var _Zend: ImageVector? = null
