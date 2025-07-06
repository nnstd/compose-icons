package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.AlphabetAurebesh: ImageVector
    get() {
        if (_AlphabetAurebesh != null) {
            return _AlphabetAurebesh!!
        }
        _AlphabetAurebesh = ImageVector.Builder(
            name = "AlphabetAurebesh",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3f, 4f)
                verticalLineTo(11f)
                horizontalLineTo(14.23f)
                lineTo(22f, 4f)
                horizontalLineTo(19f)
                lineTo(13.46f, 9f)
                horizontalLineTo(5f)
                verticalLineTo(4f)
                horizontalLineTo(3f)
                moveTo(3f, 13f)
                verticalLineTo(20f)
                horizontalLineTo(5f)
                verticalLineTo(15f)
                horizontalLineTo(13.46f)
                lineTo(19f, 20f)
                horizontalLineTo(22f)
                lineTo(14.23f, 13f)
                horizontalLineTo(3f)
                close()
            }
        }.build()

        return _AlphabetAurebesh!!
    }

@Suppress("ObjectPropertyName")
private var _AlphabetAurebesh: ImageVector? = null
