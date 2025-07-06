package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.TempleHinduOutline: ImageVector
    get() {
        if (_TempleHinduOutline != null) {
            return _TempleHinduOutline!!
        }
        _TempleHinduOutline = ImageVector.Builder(
            name = "TempleHinduOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 11f)
                verticalLineTo(13f)
                horizontalLineTo(18f)
                lineTo(15f, 3f)
                verticalLineTo(1f)
                horizontalLineTo(13f)
                verticalLineTo(3f)
                horizontalLineTo(11f)
                verticalLineTo(1f)
                horizontalLineTo(9f)
                verticalLineTo(3.1f)
                lineTo(6f, 13f)
                horizontalLineTo(4f)
                verticalLineTo(11f)
                horizontalLineTo(2f)
                verticalLineTo(22f)
                horizontalLineTo(11f)
                verticalLineTo(17f)
                horizontalLineTo(13f)
                verticalLineTo(22f)
                horizontalLineTo(22f)
                verticalLineTo(11f)
                horizontalLineTo(20f)
                moveTo(15.3f, 11f)
                horizontalLineTo(8.7f)
                lineTo(9.3f, 9f)
                horizontalLineTo(14.7f)
                lineTo(15.3f, 11f)
                moveTo(14.1f, 7f)
                horizontalLineTo(9.9f)
                lineTo(10.5f, 5f)
                horizontalLineTo(13.5f)
                lineTo(14.1f, 7f)
                moveTo(20f, 20f)
                horizontalLineTo(15f)
                verticalLineTo(15f)
                horizontalLineTo(9f)
                verticalLineTo(20f)
                horizontalLineTo(4f)
                verticalLineTo(15f)
                horizontalLineTo(7.5f)
                lineTo(8.1f, 13f)
                horizontalLineTo(15.9f)
                lineTo(16.5f, 15f)
                horizontalLineTo(20f)
                verticalLineTo(20f)
                close()
            }
        }.build()

        return _TempleHinduOutline!!
    }

@Suppress("ObjectPropertyName")
private var _TempleHinduOutline: ImageVector? = null
