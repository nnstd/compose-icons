package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BowlMix: ImageVector
    get() {
        if (_BowlMix != null) {
            return _BowlMix!!
        }
        _BowlMix = ImageVector.Builder(
            name = "BowlMix",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.2f, 11f)
                lineTo(20.3f, 4.5f)
                lineTo(22f, 5.5f)
                lineTo(18.6f, 11f)
                horizontalLineTo(16.2f)
                moveTo(15.6f, 12f)
                horizontalLineTo(2f)
                verticalLineTo(15f)
                curveTo(2f, 18.9f, 5.1f, 22f, 9f, 22f)
                horizontalLineTo(15f)
                curveTo(18.9f, 22f, 22f, 18.9f, 22f, 15f)
                verticalLineTo(12f)
                horizontalLineTo(15.6f)
                close()
            }
        }.build()

        return _BowlMix!!
    }

@Suppress("ObjectPropertyName")
private var _BowlMix: ImageVector? = null
