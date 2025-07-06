package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FileSearchOutline: ImageVector
    get() {
        if (_FileSearchOutline != null) {
            return _FileSearchOutline!!
        }
        _FileSearchOutline = ImageVector.Builder(
            name = "FileSearchOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14f, 2f)
                horizontalLineTo(6f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 4f)
                verticalLineTo(20f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 22f)
                horizontalLineTo(13f)
                curveTo(12.59f, 21.75f, 12.2f, 21.44f, 11.86f, 21.1f)
                curveTo(11.53f, 20.77f, 11.25f, 20.4f, 11f, 20f)
                horizontalLineTo(6f)
                verticalLineTo(4f)
                horizontalLineTo(13f)
                verticalLineTo(9f)
                horizontalLineTo(18f)
                verticalLineTo(10.18f)
                curveTo(18.71f, 10.34f, 19.39f, 10.61f, 20f, 11f)
                verticalLineTo(8f)
                lineTo(14f, 2f)
                moveTo(20.31f, 18.9f)
                curveTo(21.64f, 16.79f, 21f, 14f, 18.91f, 12.68f)
                curveTo(16.8f, 11.35f, 14f, 12f, 12.69f, 14.08f)
                curveTo(11.35f, 16.19f, 12f, 18.97f, 14.09f, 20.3f)
                curveTo(15.55f, 21.23f, 17.41f, 21.23f, 18.88f, 20.32f)
                lineTo(22f, 23.39f)
                lineTo(23.39f, 22f)
                lineTo(20.31f, 18.9f)
                moveTo(16.5f, 19f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14f, 16.5f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16.5f, 14f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19f, 16.5f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16.5f, 19f)
                close()
            }
        }.build()

        return _FileSearchOutline!!
    }

@Suppress("ObjectPropertyName")
private var _FileSearchOutline: ImageVector? = null
