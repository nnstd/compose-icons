package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.TelevisionShimmer: ImageVector
    get() {
        if (_TelevisionShimmer != null) {
            return _TelevisionShimmer!!
        }
        _TelevisionShimmer = ImageVector.Builder(
            name = "TelevisionShimmer",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 17f)
                horizontalLineTo(3f)
                verticalLineTo(5f)
                horizontalLineTo(21f)
                moveTo(21f, 3f)
                horizontalLineTo(3f)
                curveTo(1.9f, 3f, 1f, 3.9f, 1f, 5f)
                verticalLineTo(17f)
                curveTo(1f, 18.11f, 1.9f, 19f, 3f, 19f)
                horizontalLineTo(8f)
                verticalLineTo(21f)
                horizontalLineTo(16f)
                verticalLineTo(19f)
                horizontalLineTo(21f)
                curveTo(22.11f, 19f, 23f, 18.11f, 23f, 17f)
                verticalLineTo(5f)
                curveTo(23f, 3.9f, 22.11f, 3f, 21f, 3f)
                moveTo(15f, 6.5f)
                lineTo(14.38f, 7.87f)
                lineTo(13f, 8.5f)
                lineTo(14.38f, 9.13f)
                lineTo(15f, 10.5f)
                lineTo(15.63f, 9.13f)
                lineTo(17f, 8.5f)
                lineTo(15.63f, 7.87f)
                lineTo(15f, 6.5f)
                moveTo(10.5f, 8.5f)
                lineTo(9.41f, 10.91f)
                lineTo(7f, 12f)
                lineTo(9.41f, 13.09f)
                lineTo(10.5f, 15.5f)
                lineTo(11.6f, 13.09f)
                lineTo(14f, 12f)
                lineTo(11.6f, 10.91f)
                lineTo(10.5f, 8.5f)
            }
        }.build()

        return _TelevisionShimmer!!
    }

@Suppress("ObjectPropertyName")
private var _TelevisionShimmer: ImageVector? = null
