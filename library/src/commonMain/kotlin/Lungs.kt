package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Lungs: ImageVector
    get() {
        if (_Lungs != null) {
            return _Lungs!!
        }
        _Lungs = ImageVector.Builder(
            name = "Lungs",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15.47f, 3.11f)
                curveTo(15f, 2.85f, 14.37f, 3.05f, 14.11f, 3.54f)
                curveTo(14.04f, 3.68f, 14f, 3.84f, 14f, 4f)
                verticalLineTo(6.59f)
                lineTo(13.29f, 5.88f)
                curveTo(13.1f, 5.69f, 13f, 5.44f, 13f, 5.18f)
                verticalLineTo(1f)
                horizontalLineTo(11f)
                verticalLineTo(5.17f)
                curveTo(11f, 5.44f, 10.9f, 5.69f, 10.71f, 5.88f)
                lineTo(10f, 6.59f)
                verticalLineTo(4f)
                curveTo(10f, 3.44f, 9.54f, 3f, 9f, 3f)
                curveTo(8.83f, 3f, 8.67f, 3.04f, 8.53f, 3.11f)
                curveTo(4.72f, 5f, 2f, 9.97f, 2f, 15.77f)
                curveTo(2f, 17.67f, 2.33f, 19.55f, 3f, 21.32f)
                curveTo(3.19f, 21.85f, 3.76f, 22.13f, 4.29f, 21.94f)
                curveTo(4.34f, 21.92f, 4.39f, 21.9f, 4.44f, 21.87f)
                lineTo(9.5f, 19.07f)
                curveTo(9.81f, 18.9f, 10f, 18.56f, 10f, 18.19f)
                verticalLineTo(9.41f)
                lineTo(11.3f, 8.12f)
                curveTo(11.69f, 7.73f, 12.32f, 7.73f, 12.71f, 8.12f)
                lineTo(14f, 9.42f)
                verticalLineTo(18.2f)
                curveTo(14f, 18.56f, 14.21f, 18.9f, 14.5f, 19.08f)
                lineTo(19.58f, 21.88f)
                curveTo(20.07f, 22.14f, 20.68f, 21.96f, 20.94f, 21.46f)
                curveTo(20.96f, 21.42f, 21f, 21.37f, 21f, 21.32f)
                curveTo(21.67f, 19.55f, 22f, 17.67f, 22f, 15.77f)
                curveTo(22f, 9.97f, 19.29f, 5f, 15.47f, 3.11f)
                close()
            }
        }.build()

        return _Lungs!!
    }

@Suppress("ObjectPropertyName")
private var _Lungs: ImageVector? = null
