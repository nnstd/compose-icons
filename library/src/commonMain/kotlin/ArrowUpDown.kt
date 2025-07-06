package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ArrowUpDown: ImageVector
    get() {
        if (_ArrowUpDown != null) {
            return _ArrowUpDown!!
        }
        _ArrowUpDown = ImageVector.Builder(
            name = "ArrowUpDown",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17.45f, 17.55f)
                lineTo(12f, 23f)
                lineTo(6.55f, 17.55f)
                lineTo(7.96f, 16.14f)
                lineTo(11f, 19.17f)
                verticalLineTo(4.83f)
                lineTo(7.96f, 7.86f)
                lineTo(6.55f, 6.45f)
                lineTo(12f, 1f)
                lineTo(17.45f, 6.45f)
                lineTo(16.04f, 7.86f)
                lineTo(13f, 4.83f)
                verticalLineTo(19.17f)
                lineTo(16.04f, 16.14f)
                lineTo(17.45f, 17.55f)
                close()
            }
        }.build()

        return _ArrowUpDown!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowUpDown: ImageVector? = null
