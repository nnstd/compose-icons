package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.TransferUp: ImageVector
    get() {
        if (_TransferUp != null) {
            return _TransferUp!!
        }
        _TransferUp = ImageVector.Builder(
            name = "TransferUp",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8f, 21f)
                verticalLineTo(19f)
                horizontalLineTo(16f)
                verticalLineTo(21f)
                horizontalLineTo(8f)
                moveTo(8f, 17f)
                verticalLineTo(15f)
                horizontalLineTo(16f)
                verticalLineTo(17f)
                horizontalLineTo(8f)
                moveTo(8f, 13f)
                verticalLineTo(11f)
                horizontalLineTo(16f)
                verticalLineTo(13f)
                horizontalLineTo(8f)
                moveTo(19f, 9f)
                horizontalLineTo(5f)
                lineTo(12f, 2f)
                lineTo(19f, 9f)
                close()
            }
        }.build()

        return _TransferUp!!
    }

@Suppress("ObjectPropertyName")
private var _TransferUp: ImageVector? = null
