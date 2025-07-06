package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.TransferRight: ImageVector
    get() {
        if (_TransferRight != null) {
            return _TransferRight!!
        }
        _TransferRight = ImageVector.Builder(
            name = "TransferRight",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3f, 8f)
                horizontalLineTo(5f)
                verticalLineTo(16f)
                horizontalLineTo(3f)
                verticalLineTo(8f)
                moveTo(7f, 8f)
                horizontalLineTo(9f)
                verticalLineTo(16f)
                horizontalLineTo(7f)
                verticalLineTo(8f)
                moveTo(11f, 8f)
                horizontalLineTo(13f)
                verticalLineTo(16f)
                horizontalLineTo(11f)
                verticalLineTo(8f)
                moveTo(15f, 19.25f)
                verticalLineTo(4.75f)
                lineTo(22.25f, 12f)
                lineTo(15f, 19.25f)
                close()
            }
        }.build()

        return _TransferRight!!
    }

@Suppress("ObjectPropertyName")
private var _TransferRight: ImageVector? = null
