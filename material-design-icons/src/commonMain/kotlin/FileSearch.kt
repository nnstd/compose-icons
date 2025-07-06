package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FileSearch: ImageVector
    get() {
        if (_FileSearch != null) {
            return _FileSearch!!
        }
        _FileSearch = ImageVector.Builder(
            name = "FileSearch",
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
                curveTo(9.22f, 18.67f, 9.05f, 14.56f, 11.5f, 11.92f)
                curveTo(13.69f, 9.5f, 17.33f, 9.13f, 20f, 11f)
                verticalLineTo(8f)
                lineTo(14f, 2f)
                moveTo(13f, 9f)
                verticalLineTo(3.5f)
                lineTo(18.5f, 9f)
                horizontalLineTo(13f)
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

        return _FileSearch!!
    }

@Suppress("ObjectPropertyName")
private var _FileSearch: ImageVector? = null
