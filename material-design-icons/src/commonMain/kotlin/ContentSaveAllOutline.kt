package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ContentSaveAllOutline: ImageVector
    get() {
        if (_ContentSaveAllOutline != null) {
            return _ContentSaveAllOutline!!
        }
        _ContentSaveAllOutline = ImageVector.Builder(
            name = "ContentSaveAllOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(1f, 7f)
                horizontalLineTo(3f)
                verticalLineTo(21f)
                horizontalLineTo(17f)
                verticalLineTo(23f)
                horizontalLineTo(3f)
                curveTo(1.9f, 23f, 1f, 22.11f, 1f, 21f)
                verticalLineTo(7f)
                moveTo(19f, 1f)
                horizontalLineTo(7f)
                curveTo(5.89f, 1f, 5f, 1.9f, 5f, 3f)
                verticalLineTo(17f)
                curveTo(5f, 18.1f, 5.89f, 19f, 7f, 19f)
                horizontalLineTo(21f)
                curveTo(22.1f, 19f, 23f, 18.1f, 23f, 17f)
                verticalLineTo(5f)
                lineTo(19f, 1f)
                moveTo(21f, 17f)
                horizontalLineTo(7f)
                verticalLineTo(3f)
                horizontalLineTo(18.17f)
                lineTo(21f, 5.83f)
                verticalLineTo(17f)
                moveTo(14f, 10f)
                curveTo(12.34f, 10f, 11f, 11.34f, 11f, 13f)
                reflectiveCurveTo(12.34f, 16f, 14f, 16f)
                reflectiveCurveTo(17f, 14.66f, 17f, 13f)
                reflectiveCurveTo(15.66f, 10f, 14f, 10f)
                moveTo(8f, 4f)
                horizontalLineTo(17f)
                verticalLineTo(8f)
                horizontalLineTo(8f)
                verticalLineTo(4f)
                close()
            }
        }.build()

        return _ContentSaveAllOutline!!
    }

@Suppress("ObjectPropertyName")
private var _ContentSaveAllOutline: ImageVector? = null
