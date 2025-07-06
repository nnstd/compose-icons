package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ToothbrushPaste: ImageVector
    get() {
        if (_ToothbrushPaste != null) {
            return _ToothbrushPaste!!
        }
        _ToothbrushPaste = ImageVector.Builder(
            name = "ToothbrushPaste",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17.86f, 1.5f)
                lineTo(12.91f, 6.43f)
                lineTo(15.03f, 8.55f)
                lineTo(16.09f, 7.5f)
                lineTo(15.03f, 6.43f)
                lineTo(17.86f, 3.6f)
                lineTo(18.92f, 4.66f)
                lineTo(20f, 3.6f)
                moveTo(21.4f, 3.6f)
                lineTo(15.56f, 9.44f)
                lineTo(13.43f, 10.15f)
                lineTo(3f, 20.57f)
                lineTo(4.43f, 22f)
                lineTo(10.08f, 16.33f)
                lineTo(14.33f, 20.57f)
                lineTo(18.57f, 16.33f)
                lineTo(14.33f, 12.09f)
                lineTo(14.5f, 11.9f)
                lineTo(16.63f, 11.19f)
                lineTo(21.4f, 6.43f)
                curveTo(22.18f, 5.65f, 22.18f, 4.38f, 21.4f, 3.6f)
                moveTo(6.55f, 4.31f)
                lineTo(2.31f, 8.55f)
                lineTo(7.26f, 13.5f)
                lineTo(11.5f, 9.26f)
                moveTo(18.22f, 18.1f)
                lineTo(16.09f, 20.22f)
                lineTo(17.5f, 21.63f)
                lineTo(19.63f, 19.5f)
                close()
            }
        }.build()

        return _ToothbrushPaste!!
    }

@Suppress("ObjectPropertyName")
private var _ToothbrushPaste: ImageVector? = null
