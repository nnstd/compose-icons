package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.HumanFemaleDance: ImageVector
    get() {
        if (_HumanFemaleDance != null) {
            return _HumanFemaleDance!!
        }
        _HumanFemaleDance = ImageVector.Builder(
            name = "HumanFemaleDance",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17f, 17f)
                horizontalLineTo(15f)
                verticalLineTo(23f)
                horizontalLineTo(13f)
                verticalLineTo(17f)
                horizontalLineTo(10.88f)
                lineTo(9.34f, 18.93f)
                lineTo(11.71f, 21.29f)
                lineTo(10.29f, 22.71f)
                lineTo(7.93f, 20.34f)
                curveTo(7.58f, 20f, 7.38f, 19.53f, 7.35f, 19.04f)
                curveTo(7.32f, 18.55f, 7.47f, 18.06f, 7.78f, 17.68f)
                lineTo(8.32f, 17f)
                horizontalLineTo(7f)
                lineTo(9f, 13f)
                verticalLineTo(10f)
                curveTo(8.38f, 10.47f, 7.88f, 11.07f, 7.53f, 11.76f)
                curveTo(7.18f, 12.46f, 7f, 13.22f, 7f, 14f)
                horizontalLineTo(5f)
                curveTo(5f, 12.14f, 5.74f, 10.36f, 7.05f, 9.05f)
                curveTo(8.36f, 7.74f, 10.14f, 7f, 12f, 7f)
                curveTo(13.33f, 7f, 14.6f, 6.47f, 15.54f, 5.54f)
                curveTo(16.47f, 4.6f, 17f, 3.33f, 17f, 2f)
                horizontalLineTo(19f)
                curveTo(19f, 3.32f, 18.62f, 4.62f, 17.91f, 5.73f)
                curveTo(17.2f, 6.85f, 16.2f, 7.74f, 15f, 8.31f)
                verticalLineTo(13f)
                lineTo(17f, 17f)
                moveTo(14f, 4f)
                curveTo(14f, 4.4f, 13.88f, 4.78f, 13.66f, 5.11f)
                curveTo(13.44f, 5.44f, 13.13f, 5.7f, 12.77f, 5.85f)
                curveTo(12.4f, 6f, 12f, 6.04f, 11.61f, 5.96f)
                curveTo(11.22f, 5.88f, 10.87f, 5.69f, 10.59f, 5.41f)
                curveTo(10.31f, 5.13f, 10.12f, 4.78f, 10.04f, 4.39f)
                curveTo(9.96f, 4f, 10f, 3.6f, 10.15f, 3.24f)
                curveTo(10.3f, 2.87f, 10.56f, 2.56f, 10.89f, 2.34f)
                curveTo(11.22f, 2.12f, 11.6f, 2f, 12f, 2f)
                curveTo(12.53f, 2f, 13.04f, 2.21f, 13.41f, 2.59f)
                curveTo(13.79f, 2.96f, 14f, 3.47f, 14f, 4f)
                close()
            }
        }.build()

        return _HumanFemaleDance!!
    }

@Suppress("ObjectPropertyName")
private var _HumanFemaleDance: ImageVector? = null
