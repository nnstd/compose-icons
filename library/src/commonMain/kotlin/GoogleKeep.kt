package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.GoogleKeep: ImageVector
    get() {
        if (_GoogleKeep != null) {
            return _GoogleKeep!!
        }
        _GoogleKeep = ImageVector.Builder(
            name = "GoogleKeep",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4f, 2f)
                horizontalLineTo(20f)
                curveTo(21.11f, 2f, 22f, 2.9f, 22f, 4f)
                verticalLineTo(17.33f)
                lineTo(17.33f, 22f)
                horizontalLineTo(4f)
                curveTo(2.9f, 22f, 2f, 21.11f, 2f, 20f)
                verticalLineTo(4f)
                curveTo(2f, 2.9f, 2.9f, 2f, 4f, 2f)
                moveTo(17f, 17f)
                verticalLineTo(20.25f)
                lineTo(20.25f, 17f)
                horizontalLineTo(17f)
                moveTo(10f, 19f)
                horizontalLineTo(14f)
                verticalLineTo(18f)
                horizontalLineTo(15f)
                verticalLineTo(13f)
                curveTo(16.21f, 12.09f, 17f, 10.64f, 17f, 9f)
                curveTo(17f, 6.24f, 14.76f, 4f, 12f, 4f)
                reflectiveCurveTo(7f, 6.24f, 7f, 9f)
                curveTo(7f, 10.64f, 7.79f, 12.09f, 9f, 13f)
                verticalLineTo(18f)
                horizontalLineTo(10f)
                verticalLineTo(19f)
                moveTo(14f, 17f)
                horizontalLineTo(10f)
                verticalLineTo(15f)
                horizontalLineTo(14f)
                verticalLineTo(17f)
                moveTo(12f, 5f)
                curveTo(14.21f, 5f, 16f, 6.79f, 16f, 9f)
                curveTo(16f, 10.5f, 15.2f, 11.77f, 14f, 12.46f)
                verticalLineTo(14f)
                horizontalLineTo(10f)
                verticalLineTo(12.46f)
                curveTo(8.8f, 11.77f, 8f, 10.5f, 8f, 9f)
                curveTo(8f, 6.79f, 9.79f, 5f, 12f, 5f)
                close()
            }
        }.build()

        return _GoogleKeep!!
    }

@Suppress("ObjectPropertyName")
private var _GoogleKeep: ImageVector? = null
