package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Pen: ImageVector
    get() {
        if (_Pen != null) {
            return _Pen!!
        }
        _Pen = ImageVector.Builder(
            name = "Pen",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.71f, 7.04f)
                curveTo(20.37f, 7.38f, 20.04f, 7.71f, 20.03f, 8.04f)
                curveTo(20f, 8.36f, 20.34f, 8.69f, 20.66f, 9f)
                curveTo(21.14f, 9.5f, 21.61f, 9.95f, 21.59f, 10.44f)
                curveTo(21.57f, 10.93f, 21.06f, 11.44f, 20.55f, 11.94f)
                lineTo(16.42f, 16.08f)
                lineTo(15f, 14.66f)
                lineTo(19.25f, 10.42f)
                lineTo(18.29f, 9.46f)
                lineTo(16.87f, 10.87f)
                lineTo(13.12f, 7.12f)
                lineTo(16.96f, 3.29f)
                curveTo(17.35f, 2.9f, 18f, 2.9f, 18.37f, 3.29f)
                lineTo(20.71f, 5.63f)
                curveTo(21.1f, 6f, 21.1f, 6.65f, 20.71f, 7.04f)
                moveTo(3f, 17.25f)
                lineTo(12.56f, 7.68f)
                lineTo(16.31f, 11.43f)
                lineTo(6.75f, 21f)
                horizontalLineTo(3f)
                verticalLineTo(17.25f)
                close()
            }
        }.build()

        return _Pen!!
    }

@Suppress("ObjectPropertyName")
private var _Pen: ImageVector? = null
