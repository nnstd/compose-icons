package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Shore: ImageVector
    get() {
        if (_Shore != null) {
            return _Shore!!
        }
        _Shore = ImageVector.Builder(
            name = "Shore",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 12f)
                horizontalLineTo(22f)
                verticalLineTo(14f)
                horizontalLineTo(20f)
                curveTo(18.6f, 14f, 17.3f, 13.6f, 16f, 13f)
                curveTo(13.5f, 14.3f, 10.5f, 14.3f, 8f, 13f)
                curveTo(6.7f, 13.6f, 5.4f, 14f, 4f, 14f)
                horizontalLineTo(2f)
                verticalLineTo(12f)
                horizontalLineTo(4f)
                curveTo(5.4f, 12f, 6.8f, 11.5f, 8f, 10.7f)
                curveTo(10.4f, 12.4f, 13.6f, 12.4f, 16f, 10.7f)
                curveTo(17.2f, 11.5f, 18.6f, 12f, 20f, 12f)
                moveTo(20f, 6f)
                horizontalLineTo(22f)
                verticalLineTo(8f)
                horizontalLineTo(20f)
                curveTo(18.6f, 8f, 17.3f, 7.7f, 16f, 7f)
                curveTo(13.5f, 8.3f, 10.5f, 8.3f, 8f, 7f)
                curveTo(6.7f, 7.7f, 5.4f, 8f, 4f, 8f)
                horizontalLineTo(2f)
                verticalLineTo(6f)
                horizontalLineTo(4f)
                curveTo(5.4f, 6f, 6.8f, 5.5f, 8f, 4.7f)
                curveTo(10.4f, 6.4f, 13.6f, 6.4f, 16f, 4.7f)
                curveTo(17.2f, 5.5f, 18.6f, 6f, 20f, 6f)
                moveTo(22f, 20f)
                horizontalLineTo(2f)
                verticalLineTo(18f)
                horizontalLineTo(22f)
            }
        }.build()

        return _Shore!!
    }

@Suppress("ObjectPropertyName")
private var _Shore: ImageVector? = null
