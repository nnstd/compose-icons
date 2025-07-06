package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ThumbsUpDownOutline: ImageVector
    get() {
        if (_ThumbsUpDownOutline != null) {
            return _ThumbsUpDownOutline!!
        }
        _ThumbsUpDownOutline = ImageVector.Builder(
            name = "ThumbsUpDownOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 6f)
                curveTo(12f, 5.45f, 11.55f, 5f, 11f, 5f)
                horizontalLineTo(5.82f)
                lineTo(6.5f, 1.82f)
                lineTo(6.5f, 1.59f)
                curveTo(6.5f, 1.28f, 6.37f, 1f, 6.17f, 0.79f)
                lineTo(5.38f, 0f)
                lineTo(0.44f, 4.94f)
                curveTo(0.17f, 5.21f, 0f, 5.59f, 0f, 6f)
                verticalLineTo(12.5f)
                curveTo(0f, 13.33f, 0.67f, 14f, 1.5f, 14f)
                horizontalLineTo(8.25f)
                curveTo(8.87f, 14f, 9.4f, 13.62f, 9.63f, 13.09f)
                lineTo(11.89f, 7.8f)
                curveTo(11.96f, 7.63f, 12f, 7.44f, 12f, 7.25f)
                verticalLineTo(6f)
                moveTo(10f, 7.13f)
                lineTo(7.92f, 12f)
                horizontalLineTo(2f)
                verticalLineTo(6.21f)
                lineTo(3.93f, 4.28f)
                lineTo(3.36f, 7f)
                horizontalLineTo(10f)
                verticalLineTo(7.13f)
                moveTo(22.5f, 10f)
                horizontalLineTo(15.75f)
                curveTo(15.13f, 10f, 14.6f, 10.38f, 14.37f, 10.91f)
                lineTo(12.11f, 16.2f)
                curveTo(12.04f, 16.37f, 12f, 16.56f, 12f, 16.75f)
                verticalLineTo(18f)
                curveTo(12f, 18.55f, 12.45f, 19f, 13f, 19f)
                horizontalLineTo(18.18f)
                lineTo(17.5f, 22.18f)
                lineTo(17.5f, 22.42f)
                curveTo(17.5f, 22.73f, 17.63f, 23f, 17.83f, 23.22f)
                lineTo(18.62f, 24f)
                lineTo(23.56f, 19.06f)
                curveTo(23.83f, 18.79f, 24f, 18.41f, 24f, 18f)
                verticalLineTo(11.5f)
                curveTo(24f, 10.67f, 23.33f, 10f, 22.5f, 10f)
                moveTo(22f, 17.79f)
                lineTo(20.07f, 19.72f)
                lineTo(20.64f, 17f)
                horizontalLineTo(14f)
                verticalLineTo(16.87f)
                lineTo(16.08f, 12f)
                horizontalLineTo(22f)
                verticalLineTo(17.79f)
                close()
            }
        }.build()

        return _ThumbsUpDownOutline!!
    }

@Suppress("ObjectPropertyName")
private var _ThumbsUpDownOutline: ImageVector? = null
