package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.TransferLeft: ImageVector
    get() {
        if (_TransferLeft != null) {
            return _TransferLeft!!
        }
        _TransferLeft = ImageVector.Builder(
            name = "TransferLeft",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 16f)
                horizontalLineTo(19f)
                verticalLineTo(8f)
                horizontalLineTo(21f)
                verticalLineTo(16f)
                moveTo(17f, 16f)
                horizontalLineTo(15f)
                verticalLineTo(8f)
                horizontalLineTo(17f)
                verticalLineTo(16f)
                moveTo(13f, 16f)
                horizontalLineTo(11f)
                verticalLineTo(8f)
                horizontalLineTo(13f)
                verticalLineTo(16f)
                moveTo(9f, 5f)
                verticalLineTo(19f)
                lineTo(2f, 12f)
                lineTo(9f, 5f)
                close()
            }
        }.build()

        return _TransferLeft!!
    }

@Suppress("ObjectPropertyName")
private var _TransferLeft: ImageVector? = null
