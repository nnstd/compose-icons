package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Kettle: ImageVector
    get() {
        if (_Kettle != null) {
            return _Kettle!!
        }
        _Kettle = ImageVector.Builder(
            name = "Kettle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.5f, 3f)
                curveTo(7.81f, 3f, 4f, 5.69f, 4f, 9f)
                verticalLineTo(9f)
                curveTo(4f, 10.19f, 4.5f, 11.34f, 5.44f, 12.33f)
                curveTo(4.53f, 13.5f, 4f, 14.96f, 4f, 16.5f)
                curveTo(4f, 17.64f, 4f, 18.83f, 4f, 20f)
                curveTo(4f, 21.11f, 4.89f, 22f, 6f, 22f)
                horizontalLineTo(19f)
                curveTo(20.11f, 22f, 21f, 21.11f, 21f, 20f)
                curveTo(21f, 18.85f, 21f, 17.61f, 21f, 16.5f)
                curveTo(21f, 15.28f, 20.66f, 14.07f, 20f, 13f)
                lineTo(22f, 11f)
                lineTo(19f, 8f)
                lineTo(16.9f, 10.1f)
                curveTo(15.58f, 9.38f, 14.05f, 9f, 12.5f, 9f)
                curveTo(10.65f, 9f, 8.95f, 9.53f, 7.55f, 10.41f)
                curveTo(7.19f, 9.97f, 7f, 9.5f, 7f, 9f)
                curveTo(7f, 7.21f, 9.46f, 5.75f, 12.5f, 5.75f)
                verticalLineTo(5.75f)
                curveTo(13.93f, 5.75f, 15.3f, 6.08f, 16.33f, 6.67f)
                lineTo(18.35f, 4.65f)
                curveTo(16.77f, 3.59f, 14.68f, 3f, 12.5f, 3f)
                moveTo(12.5f, 11f)
                curveTo(12.84f, 11f, 13.17f, 11.04f, 13.5f, 11.09f)
                curveTo(10.39f, 11.57f, 8f, 14.25f, 8f, 17.5f)
                verticalLineTo(20f)
                horizontalLineTo(6f)
                verticalLineTo(17.5f)
                arcTo(6.5f, 6.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12.5f, 11f)
                close()
            }
        }.build()

        return _Kettle!!
    }

@Suppress("ObjectPropertyName")
private var _Kettle: ImageVector? = null
