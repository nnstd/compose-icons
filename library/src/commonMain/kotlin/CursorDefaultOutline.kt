package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CursorDefaultOutline: ImageVector
    get() {
        if (_CursorDefaultOutline != null) {
            return _CursorDefaultOutline!!
        }
        _CursorDefaultOutline = ImageVector.Builder(
            name = "CursorDefaultOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10.07f, 14.27f)
                curveTo(10.57f, 14.03f, 11.16f, 14.25f, 11.4f, 14.75f)
                lineTo(13.7f, 19.74f)
                lineTo(15.5f, 18.89f)
                lineTo(13.19f, 13.91f)
                curveTo(12.95f, 13.41f, 13.17f, 12.81f, 13.67f, 12.58f)
                lineTo(13.95f, 12.5f)
                lineTo(16.25f, 12.05f)
                lineTo(8f, 5.12f)
                verticalLineTo(15.9f)
                lineTo(9.82f, 14.43f)
                lineTo(10.07f, 14.27f)
                moveTo(13.64f, 21.97f)
                curveTo(13.14f, 22.21f, 12.54f, 22f, 12.31f, 21.5f)
                lineTo(10.13f, 16.76f)
                lineTo(7.62f, 18.78f)
                curveTo(7.45f, 18.92f, 7.24f, 19f, 7f, 19f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 18f)
                verticalLineTo(3f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7f, 2f)
                curveTo(7.24f, 2f, 7.47f, 2.09f, 7.64f, 2.23f)
                lineTo(7.65f, 2.22f)
                lineTo(19.14f, 11.86f)
                curveTo(19.57f, 12.22f, 19.62f, 12.85f, 19.27f, 13.27f)
                curveTo(19.12f, 13.45f, 18.91f, 13.57f, 18.7f, 13.61f)
                lineTo(15.54f, 14.23f)
                lineTo(17.74f, 18.96f)
                curveTo(18f, 19.46f, 17.76f, 20.05f, 17.26f, 20.28f)
                lineTo(13.64f, 21.97f)
                close()
            }
        }.build()

        return _CursorDefaultOutline!!
    }

@Suppress("ObjectPropertyName")
private var _CursorDefaultOutline: ImageVector? = null
