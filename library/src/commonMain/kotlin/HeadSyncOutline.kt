package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.HeadSyncOutline: ImageVector
    get() {
        if (_HeadSyncOutline != null) {
            return _HeadSyncOutline!!
        }
        _HeadSyncOutline = ImageVector.Builder(
            name = "HeadSyncOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 3f)
                curveTo(16.88f, 3f, 20f, 6.14f, 20f, 10f)
                curveTo(20f, 12.8f, 18.37f, 15.19f, 16f, 16.31f)
                verticalLineTo(21f)
                horizontalLineTo(9f)
                verticalLineTo(18f)
                horizontalLineTo(8f)
                curveTo(6.89f, 18f, 6f, 17.11f, 6f, 16f)
                verticalLineTo(13f)
                horizontalLineTo(4.5f)
                curveTo(4.08f, 13f, 3.84f, 12.5f, 4.08f, 12.19f)
                lineTo(6f, 9.66f)
                curveTo(6.19f, 5.95f, 9.23f, 3f, 13f, 3f)
                moveTo(13f, 1f)
                curveTo(8.41f, 1f, 4.61f, 4.42f, 4.06f, 8.9f)
                lineTo(2.5f, 11f)
                lineTo(2.47f, 11f)
                lineTo(2.45f, 11.03f)
                curveTo(1.9f, 11.79f, 1.83f, 12.79f, 2.26f, 13.62f)
                curveTo(2.62f, 14.31f, 3.26f, 14.79f, 4f, 14.94f)
                verticalLineTo(16f)
                curveTo(4f, 17.85f, 5.28f, 19.42f, 7f, 19.87f)
                verticalLineTo(23f)
                horizontalLineTo(18f)
                verticalLineTo(17.5f)
                curveTo(20.5f, 15.83f, 22f, 13.06f, 22f, 10f)
                curveTo(22f, 5.03f, 17.96f, 1f, 13f, 1f)
                moveTo(14f, 15f)
                verticalLineTo(13.5f)
                curveTo(11.79f, 13.5f, 10f, 11.71f, 10f, 9.5f)
                curveTo(10f, 8.68f, 10.25f, 7.92f, 10.67f, 7.29f)
                lineTo(11.76f, 8.38f)
                curveTo(11.59f, 8.72f, 11.5f, 9.1f, 11.5f, 9.5f)
                curveTo(11.5f, 10.88f, 12.62f, 12f, 14f, 12f)
                verticalLineTo(10.5f)
                lineTo(16.25f, 12.75f)
                lineTo(14f, 15f)
                moveTo(17.33f, 11.71f)
                lineTo(16.24f, 10.62f)
                curveTo(16.41f, 10.28f, 16.5f, 9.9f, 16.5f, 9.5f)
                curveTo(16.5f, 8.12f, 15.38f, 7f, 14f, 7f)
                verticalLineTo(8.5f)
                lineTo(11.75f, 6.25f)
                lineTo(14f, 4f)
                verticalLineTo(5.5f)
                curveTo(16.21f, 5.5f, 18f, 7.29f, 18f, 9.5f)
                curveTo(18f, 10.32f, 17.75f, 11.08f, 17.33f, 11.71f)
                close()
            }
        }.build()

        return _HeadSyncOutline!!
    }

@Suppress("ObjectPropertyName")
private var _HeadSyncOutline: ImageVector? = null
