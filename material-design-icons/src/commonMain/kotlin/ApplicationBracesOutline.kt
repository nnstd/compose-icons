package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ApplicationBracesOutline: ImageVector
    get() {
        if (_ApplicationBracesOutline != null) {
            return _ApplicationBracesOutline!!
        }
        _ApplicationBracesOutline = ImageVector.Builder(
            name = "ApplicationBracesOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 2f)
                horizontalLineTo(3f)
                curveTo(1.9f, 2f, 1f, 2.9f, 1f, 4f)
                verticalLineTo(20f)
                curveTo(1f, 21.1f, 1.9f, 22f, 3f, 22f)
                horizontalLineTo(21f)
                curveTo(22.1f, 22f, 23f, 21.1f, 23f, 20f)
                verticalLineTo(4f)
                curveTo(23f, 2.9f, 22.1f, 2f, 21f, 2f)
                moveTo(21f, 20f)
                horizontalLineTo(3f)
                verticalLineTo(6f)
                horizontalLineTo(21f)
                verticalLineTo(20f)
                moveTo(9f, 8f)
                curveTo(7.9f, 8f, 7f, 8.9f, 7f, 10f)
                curveTo(7f, 11.1f, 6.1f, 12f, 5f, 12f)
                verticalLineTo(14f)
                curveTo(6.1f, 14f, 7f, 14.9f, 7f, 16f)
                curveTo(7f, 17.1f, 7.9f, 18f, 9f, 18f)
                horizontalLineTo(11f)
                verticalLineTo(16f)
                horizontalLineTo(9f)
                verticalLineTo(15f)
                curveTo(9f, 13.9f, 8.1f, 13f, 7f, 13f)
                curveTo(8.1f, 13f, 9f, 12.1f, 9f, 11f)
                verticalLineTo(10f)
                horizontalLineTo(11f)
                verticalLineTo(8f)
                moveTo(15f, 8f)
                curveTo(16.1f, 8f, 17f, 8.9f, 17f, 10f)
                curveTo(17f, 11.1f, 17.9f, 12f, 19f, 12f)
                verticalLineTo(14f)
                curveTo(17.9f, 14f, 17f, 14.9f, 17f, 16f)
                curveTo(17f, 17.1f, 16.1f, 18f, 15f, 18f)
                horizontalLineTo(13f)
                verticalLineTo(16f)
                horizontalLineTo(15f)
                verticalLineTo(15f)
                curveTo(15f, 13.9f, 15.9f, 13f, 17f, 13f)
                curveTo(15.9f, 13f, 15f, 12.1f, 15f, 11f)
                verticalLineTo(10f)
                horizontalLineTo(13f)
                verticalLineTo(8f)
                horizontalLineTo(15f)
                close()
            }
        }.build()

        return _ApplicationBracesOutline!!
    }

@Suppress("ObjectPropertyName")
private var _ApplicationBracesOutline: ImageVector? = null
