package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ContentSavePlusOutline: ImageVector
    get() {
        if (_ContentSavePlusOutline != null) {
            return _ContentSavePlusOutline!!
        }
        _ContentSavePlusOutline = ImageVector.Builder(
            name = "ContentSavePlusOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5f, 3f)
                curveTo(3.89f, 3f, 3f, 3.9f, 3f, 5f)
                verticalLineTo(19f)
                curveTo(3f, 20.1f, 3.89f, 21f, 5f, 21f)
                horizontalLineTo(12.81f)
                curveTo(12.45f, 20.38f, 12.2f, 19.7f, 12.08f, 19f)
                horizontalLineTo(5f)
                verticalLineTo(5f)
                horizontalLineTo(16.17f)
                lineTo(19f, 7.83f)
                verticalLineTo(12.08f)
                curveTo(19.7f, 12.2f, 20.38f, 12.45f, 21f, 12.81f)
                verticalLineTo(7f)
                lineTo(17f, 3f)
                horizontalLineTo(5f)
                moveTo(6f, 6f)
                verticalLineTo(10f)
                horizontalLineTo(15f)
                verticalLineTo(6f)
                horizontalLineTo(6f)
                moveTo(12f, 12f)
                curveTo(10.34f, 12f, 9f, 13.34f, 9f, 15f)
                reflectiveCurveTo(10.34f, 18f, 12f, 18f)
                curveTo(12f, 16.11f, 12.89f, 14.34f, 14.39f, 13.21f)
                curveTo(13.85f, 12.5f, 13f, 12f, 12f, 12f)
                moveTo(17f, 14f)
                verticalLineTo(17f)
                horizontalLineTo(14f)
                verticalLineTo(19f)
                horizontalLineTo(17f)
                verticalLineTo(22f)
                horizontalLineTo(19f)
                verticalLineTo(19f)
                horizontalLineTo(22f)
                verticalLineTo(17f)
                horizontalLineTo(19f)
                verticalLineTo(14f)
                horizontalLineTo(17f)
                close()
            }
        }.build()

        return _ContentSavePlusOutline!!
    }

@Suppress("ObjectPropertyName")
private var _ContentSavePlusOutline: ImageVector? = null
