package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.EthernetCable: ImageVector
    get() {
        if (_EthernetCable != null) {
            return _EthernetCable!!
        }
        _EthernetCable = ImageVector.Builder(
            name = "EthernetCable",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11f, 3f)
                verticalLineTo(7f)
                horizontalLineTo(13f)
                verticalLineTo(3f)
                horizontalLineTo(11f)
                moveTo(8f, 4f)
                verticalLineTo(11f)
                horizontalLineTo(16f)
                verticalLineTo(4f)
                horizontalLineTo(14f)
                verticalLineTo(8f)
                horizontalLineTo(10f)
                verticalLineTo(4f)
                horizontalLineTo(8f)
                moveTo(10f, 12f)
                verticalLineTo(22f)
                horizontalLineTo(14f)
                verticalLineTo(12f)
                horizontalLineTo(10f)
                close()
            }
        }.build()

        return _EthernetCable!!
    }

@Suppress("ObjectPropertyName")
private var _EthernetCable: ImageVector? = null
