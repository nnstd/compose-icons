package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Rotate3DVariant: ImageVector
    get() {
        if (_Rotate3DVariant != null) {
            return _Rotate3DVariant!!
        }
        _Rotate3DVariant = ImageVector.Builder(
            name = "Rotate3DVariant",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 5f)
                curveTo(16.97f, 5f, 21f, 7.69f, 21f, 11f)
                curveTo(21f, 12.68f, 19.96f, 14.2f, 18.29f, 15.29f)
                curveTo(19.36f, 14.42f, 20f, 13.32f, 20f, 12.13f)
                curveTo(20f, 9.29f, 16.42f, 7f, 12f, 7f)
                verticalLineTo(10f)
                lineTo(8f, 6f)
                lineTo(12f, 2f)
                verticalLineTo(5f)
                moveTo(12f, 19f)
                curveTo(7.03f, 19f, 3f, 16.31f, 3f, 13f)
                curveTo(3f, 11.32f, 4.04f, 9.8f, 5.71f, 8.71f)
                curveTo(4.64f, 9.58f, 4f, 10.68f, 4f, 11.88f)
                curveTo(4f, 14.71f, 7.58f, 17f, 12f, 17f)
                verticalLineTo(14f)
                lineTo(16f, 18f)
                lineTo(12f, 22f)
                verticalLineTo(19f)
                close()
            }
        }.build()

        return _Rotate3DVariant!!
    }

@Suppress("ObjectPropertyName")
private var _Rotate3DVariant: ImageVector? = null
