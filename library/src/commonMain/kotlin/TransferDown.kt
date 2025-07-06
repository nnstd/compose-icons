package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.TransferDown: ImageVector
    get() {
        if (_TransferDown != null) {
            return _TransferDown!!
        }
        _TransferDown = ImageVector.Builder(
            name = "TransferDown",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16f, 3f)
                verticalLineTo(5f)
                horizontalLineTo(8f)
                verticalLineTo(3f)
                horizontalLineTo(16f)
                moveTo(16f, 7f)
                verticalLineTo(9f)
                horizontalLineTo(8f)
                verticalLineTo(7f)
                horizontalLineTo(16f)
                moveTo(16f, 11f)
                verticalLineTo(13f)
                horizontalLineTo(8f)
                verticalLineTo(11f)
                horizontalLineTo(16f)
                moveTo(5f, 15f)
                horizontalLineTo(19f)
                lineTo(12f, 22f)
                lineTo(5f, 15f)
                close()
            }
        }.build()

        return _TransferDown!!
    }

@Suppress("ObjectPropertyName")
private var _TransferDown: ImageVector? = null
