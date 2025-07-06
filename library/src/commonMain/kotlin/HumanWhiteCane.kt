package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.HumanWhiteCane: ImageVector
    get() {
        if (_HumanWhiteCane != null) {
            return _HumanWhiteCane!!
        }
        _HumanWhiteCane = ImageVector.Builder(
            name = "HumanWhiteCane",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8f, 4f)
                curveTo(8f, 2.9f, 8.9f, 2f, 10f, 2f)
                curveTo(11.11f, 2f, 12f, 2.9f, 12f, 4f)
                curveTo(12f, 5.11f, 11.11f, 6f, 10f, 6f)
                curveTo(8.9f, 6f, 8f, 5.11f, 8f, 4f)
                moveTo(20.65f, 21.5f)
                lineTo(14.5f, 10.85f)
                lineTo(14.5f, 10.85f)
                verticalLineTo(10.85f)
                curveTo(13.77f, 10.85f, 13.23f, 10.65f, 12.64f, 10.26f)
                curveTo(12.04f, 9.87f, 11.6f, 9.38f, 11.31f, 8.8f)
                lineTo(10.57f, 7.23f)
                curveTo(10.39f, 6.88f, 10.15f, 6.62f, 9.83f, 6.44f)
                curveTo(9.54f, 6.27f, 9.23f, 6.18f, 8.91f, 6.18f)
                curveTo(8.59f, 6.18f, 8.29f, 6.26f, 8f, 6.4f)
                lineTo(3f, 9.23f)
                verticalLineTo(13.63f)
                horizontalLineTo(4.86f)
                verticalLineTo(10.32f)
                lineTo(6.25f, 9.54f)
                lineTo(5.91f, 11.11f)
                curveTo(5.82f, 11.63f, 5.77f, 12.15f, 5.77f, 12.68f)
                verticalLineTo(17.64f)
                lineTo(3.38f, 20.87f)
                lineTo(4.86f, 22f)
                lineTo(7.65f, 18.25f)
                lineTo(7.82f, 15f)
                lineTo(9.5f, 17.34f)
                verticalLineTo(22f)
                horizontalLineTo(11.35f)
                verticalLineTo(15.94f)
                lineTo(9.5f, 13.33f)
                verticalLineTo(12.68f)
                curveTo(9.5f, 12.24f, 9.5f, 11.81f, 9.61f, 11.39f)
                lineTo(9.96f, 10.19f)
                curveTo(10.34f, 10.74f, 10.81f, 11.2f, 11.35f, 11.63f)
                curveTo(12.2f, 12.31f, 13f, 12.59f, 14.35f, 12.58f)
                lineTo(19.78f, 22f)
                lineTo(20.65f, 21.5f)
                close()
            }
        }.build()

        return _HumanWhiteCane!!
    }

@Suppress("ObjectPropertyName")
private var _HumanWhiteCane: ImageVector? = null
