package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.PencilRuler: ImageVector
    get() {
        if (_PencilRuler != null) {
            return _PencilRuler!!
        }
        _PencilRuler = ImageVector.Builder(
            name = "PencilRuler",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3f, 17.25f)
                verticalLineTo(21f)
                horizontalLineTo(6.75f)
                lineTo(17.81f, 9.93f)
                lineTo(14.06f, 6.18f)
                lineTo(3f, 17.25f)
                moveTo(22.61f, 18.36f)
                lineTo(18.36f, 22.61f)
                lineTo(13.16f, 17.41f)
                lineTo(14.93f, 15.64f)
                lineTo(15.93f, 16.64f)
                lineTo(18.4f, 14.16f)
                lineTo(19.82f, 15.58f)
                lineTo(18.36f, 17f)
                lineTo(19.42f, 18f)
                lineTo(20.84f, 16.6f)
                lineTo(22.61f, 18.36f)
                moveTo(6.61f, 10.83f)
                lineTo(1.39f, 5.64f)
                lineTo(5.64f, 1.39f)
                lineTo(7.4f, 3.16f)
                lineTo(4.93f, 5.64f)
                lineTo(6f, 6.7f)
                lineTo(8.46f, 4.22f)
                lineTo(9.88f, 5.64f)
                lineTo(8.46f, 7.05f)
                lineTo(9.46f, 8.05f)
                lineTo(6.61f, 10.83f)
                moveTo(20.71f, 7f)
                curveTo(21.1f, 6.61f, 21.1f, 6f, 20.71f, 5.59f)
                lineTo(18.37f, 3.29f)
                curveTo(18f, 2.9f, 17.35f, 2.9f, 16.96f, 3.29f)
                lineTo(15.12f, 5.12f)
                lineTo(18.87f, 8.87f)
                lineTo(20.71f, 7f)
                close()
            }
        }.build()

        return _PencilRuler!!
    }

@Suppress("ObjectPropertyName")
private var _PencilRuler: ImageVector? = null
