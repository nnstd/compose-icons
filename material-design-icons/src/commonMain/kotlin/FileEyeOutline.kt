package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FileEyeOutline: ImageVector
    get() {
        if (_FileEyeOutline != null) {
            return _FileEyeOutline!!
        }
        _FileEyeOutline = ImageVector.Builder(
            name = "FileEyeOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17f, 18f)
                curveTo(17.56f, 18f, 18f, 18.44f, 18f, 19f)
                curveTo(18f, 19.56f, 17.56f, 20f, 17f, 20f)
                curveTo(16.44f, 20f, 16f, 19.56f, 16f, 19f)
                curveTo(16f, 18.44f, 16.44f, 18f, 17f, 18f)
                moveTo(17f, 15f)
                curveTo(14.27f, 15f, 11.94f, 16.66f, 11f, 19f)
                curveTo(11.94f, 21.34f, 14.27f, 23f, 17f, 23f)
                curveTo(19.73f, 23f, 22.06f, 21.34f, 23f, 19f)
                curveTo(22.06f, 16.66f, 19.73f, 15f, 17f, 15f)
                moveTo(17f, 21.5f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14.5f, 19f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17f, 16.5f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19.5f, 19f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17f, 21.5f)
                moveTo(9.27f, 20f)
                horizontalLineTo(6f)
                verticalLineTo(4f)
                horizontalLineTo(13f)
                verticalLineTo(9f)
                horizontalLineTo(18f)
                verticalLineTo(13.07f)
                curveTo(18.7f, 13.15f, 19.36f, 13.32f, 20f, 13.56f)
                verticalLineTo(8f)
                lineTo(14f, 2f)
                horizontalLineTo(6f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 4f)
                verticalLineTo(20f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 22f)
                horizontalLineTo(10.5f)
                curveTo(10f, 21.41f, 9.59f, 20.73f, 9.27f, 20f)
                close()
            }
        }.build()

        return _FileEyeOutline!!
    }

@Suppress("ObjectPropertyName")
private var _FileEyeOutline: ImageVector? = null
