package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.TagEdit: ImageVector
    get() {
        if (_TagEdit != null) {
            return _TagEdit!!
        }
        _TagEdit = ImageVector.Builder(
            name = "TagEdit",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.41f, 2.58f)
                lineTo(21.41f, 11.58f)
                curveTo(21.77f, 11.94f, 22f, 12.44f, 22f, 13f)
                curveTo(22f, 13.55f, 21.78f, 14.05f, 21.41f, 14.41f)
                lineTo(14.41f, 21.41f)
                curveTo(14.05f, 21.77f, 13.55f, 22f, 13f, 22f)
                curveTo(12.45f, 22f, 11.95f, 21.77f, 11.58f, 21.41f)
                lineTo(9.45f, 19.28f)
                lineTo(10.7f, 18.03f)
                lineTo(10.7f, 18.04f)
                lineTo(13.11f, 15.62f)
                curveTo(14.11f, 14.63f, 14.11f, 13f, 13.11f, 12f)
                lineTo(11.83f, 10.74f)
                curveTo(10.84f, 9.75f, 9.23f, 9.75f, 8.24f, 10.74f)
                lineTo(8.07f, 10.91f)
                lineTo(8.06f, 10.91f)
                lineTo(4.57f, 14.4f)
                lineTo(2.59f, 12.41f)
                curveTo(2.22f, 12.05f, 2f, 11.55f, 2f, 11f)
                verticalLineTo(4f)
                curveTo(2f, 2.89f, 2.89f, 2f, 4f, 2f)
                horizontalLineTo(11f)
                curveTo(11.55f, 2f, 12.05f, 2.22f, 12.41f, 2.58f)
                moveTo(4.44f, 6.56f)
                curveTo(4.72f, 6.84f, 5.1f, 7f, 5.5f, 7f)
                curveTo(5.9f, 7f, 6.28f, 6.84f, 6.56f, 6.56f)
                curveTo(6.84f, 6.28f, 7f, 5.9f, 7f, 5.5f)
                curveTo(7f, 5.1f, 6.84f, 4.72f, 6.56f, 4.44f)
                curveTo(6.28f, 4.16f, 5.9f, 4f, 5.5f, 4f)
                curveTo(5.1f, 4f, 4.72f, 4.16f, 4.44f, 4.44f)
                curveTo(4.16f, 4.72f, 4f, 5.1f, 4f, 5.5f)
                curveTo(4f, 5.9f, 4.16f, 6.28f, 4.44f, 6.56f)
                moveTo(10.7f, 15.35f)
                lineTo(11.7f, 14.35f)
                curveTo(11.91f, 14.14f, 11.91f, 13.79f, 11.7f, 13.58f)
                lineTo(10.42f, 12.3f)
                curveTo(10.21f, 12.09f, 9.86f, 12.09f, 9.65f, 12.3f)
                lineTo(8.65f, 13.3f)
                lineTo(10.7f, 15.35f)
                moveTo(8.06f, 13.88f)
                lineTo(2f, 19.94f)
                verticalLineTo(22f)
                horizontalLineTo(4.06f)
                lineTo(10.11f, 15.93f)
                lineTo(8.06f, 13.88f)
                close()
            }
        }.build()

        return _TagEdit!!
    }

@Suppress("ObjectPropertyName")
private var _TagEdit: ImageVector? = null
