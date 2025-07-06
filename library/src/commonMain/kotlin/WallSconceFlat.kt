package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.WallSconceFlat: ImageVector
    get() {
        if (_WallSconceFlat != null) {
            return _WallSconceFlat!!
        }
        _WallSconceFlat = ImageVector.Builder(
            name = "WallSconceFlat",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5f, 5f)
                verticalLineTo(11f)
                horizontalLineTo(19f)
                verticalLineTo(5f)
                horizontalLineTo(5f)
                moveTo(5.27f, 13.32f)
                lineTo(3.5f, 15.09f)
                lineTo(4.91f, 16.5f)
                lineTo(6.68f, 14.73f)
                lineTo(5.27f, 13.32f)
                moveTo(18.73f, 13.32f)
                lineTo(17.32f, 14.73f)
                lineTo(19.09f, 16.5f)
                lineTo(20.5f, 15.09f)
                lineTo(18.73f, 13.32f)
                moveTo(11f, 16f)
                verticalLineTo(19f)
                horizontalLineTo(13f)
                verticalLineTo(16f)
                horizontalLineTo(11f)
                close()
            }
        }.build()

        return _WallSconceFlat!!
    }

@Suppress("ObjectPropertyName")
private var _WallSconceFlat: ImageVector? = null
