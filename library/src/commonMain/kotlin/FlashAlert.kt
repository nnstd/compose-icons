package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FlashAlert: ImageVector
    get() {
        if (_FlashAlert != null) {
            return _FlashAlert!!
        }
        _FlashAlert = ImageVector.Builder(
            name = "FlashAlert",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5f, 2f)
                verticalLineTo(13f)
                horizontalLineTo(8f)
                verticalLineTo(22f)
                lineTo(15f, 10f)
                horizontalLineTo(11f)
                lineTo(15f, 2f)
                moveTo(17f, 15f)
                horizontalLineTo(19f)
                verticalLineTo(17f)
                horizontalLineTo(17f)
                verticalLineTo(15f)
                moveTo(17f, 7f)
                horizontalLineTo(19f)
                verticalLineTo(13f)
                horizontalLineTo(17f)
                verticalLineTo(7f)
                close()
            }
        }.build()

        return _FlashAlert!!
    }

@Suppress("ObjectPropertyName")
private var _FlashAlert: ImageVector? = null
