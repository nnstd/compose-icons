package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.InstrumentTriangle: ImageVector
    get() {
        if (_InstrumentTriangle != null) {
            return _InstrumentTriangle!!
        }
        _InstrumentTriangle = ImageVector.Builder(
            name = "InstrumentTriangle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11.5f, 2f)
                horizontalLineTo(10.5f)
                verticalLineTo(6.2f)
                curveTo(10.4f, 6.3f, 10.3f, 6.3f, 10.2f, 6.5f)
                lineTo(2.1f, 20.7f)
                curveTo(1.8f, 21.3f, 2.2f, 22f, 2.9f, 22f)
                horizontalLineTo(16f)
                verticalLineTo(20f)
                horizontalLineTo(4.8f)
                lineTo(11f, 9.2f)
                lineTo(16.7f, 19.2f)
                lineTo(18.4f, 18.2f)
                lineTo(11.8f, 6.4f)
                lineTo(11.5f, 6.1f)
                verticalLineTo(2f)
                moveTo(21f, 6f)
                horizontalLineTo(20f)
                verticalLineTo(18f)
                lineTo(19.5f, 22f)
                horizontalLineTo(21.5f)
                lineTo(21f, 18f)
                verticalLineTo(6f)
                close()
            }
        }.build()

        return _InstrumentTriangle!!
    }

@Suppress("ObjectPropertyName")
private var _InstrumentTriangle: ImageVector? = null
