package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FilePowerpointBox: ImageVector
    get() {
        if (_FilePowerpointBox != null) {
            return _FilePowerpointBox!!
        }
        _FilePowerpointBox = ImageVector.Builder(
            name = "FilePowerpointBox",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9.8f, 13.4f)
                horizontalLineTo(12.3f)
                curveTo(13.8f, 13.4f, 14.46f, 13.12f, 15.1f, 12.58f)
                curveTo(15.74f, 12.03f, 16f, 11.25f, 16f, 10.23f)
                curveTo(16f, 9.26f, 15.75f, 8.5f, 15.1f, 7.88f)
                curveTo(14.45f, 7.29f, 13.83f, 7f, 12.3f, 7f)
                horizontalLineTo(8f)
                verticalLineTo(17f)
                horizontalLineTo(9.8f)
                verticalLineTo(13.4f)
                moveTo(19f, 3f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 5f)
                verticalLineTo(19f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19f, 21f)
                horizontalLineTo(5f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 19f)
                verticalLineTo(5f)
                curveTo(3f, 3.89f, 3.9f, 3f, 5f, 3f)
                horizontalLineTo(19f)
                moveTo(9.8f, 12f)
                verticalLineTo(8.4f)
                horizontalLineTo(12.1f)
                curveTo(12.76f, 8.4f, 13.27f, 8.65f, 13.6f, 9f)
                curveTo(13.93f, 9.35f, 14.1f, 9.72f, 14.1f, 10.24f)
                curveTo(14.1f, 10.8f, 13.92f, 11.19f, 13.6f, 11.5f)
                curveTo(13.28f, 11.81f, 12.9f, 12f, 12.22f, 12f)
                horizontalLineTo(9.8f)
                close()
            }
        }.build()

        return _FilePowerpointBox!!
    }

@Suppress("ObjectPropertyName")
private var _FilePowerpointBox: ImageVector? = null
