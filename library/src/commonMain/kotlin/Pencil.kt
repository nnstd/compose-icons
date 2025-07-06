package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Pencil: ImageVector
    get() {
        if (_Pencil != null) {
            return _Pencil!!
        }
        _Pencil = ImageVector.Builder(
            name = "Pencil",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.71f, 7.04f)
                curveTo(21.1f, 6.65f, 21.1f, 6f, 20.71f, 5.63f)
                lineTo(18.37f, 3.29f)
                curveTo(18f, 2.9f, 17.35f, 2.9f, 16.96f, 3.29f)
                lineTo(15.12f, 5.12f)
                lineTo(18.87f, 8.87f)
                moveTo(3f, 17.25f)
                verticalLineTo(21f)
                horizontalLineTo(6.75f)
                lineTo(17.81f, 9.93f)
                lineTo(14.06f, 6.18f)
                lineTo(3f, 17.25f)
                close()
            }
        }.build()

        return _Pencil!!
    }

@Suppress("ObjectPropertyName")
private var _Pencil: ImageVector? = null
