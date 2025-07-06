package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.StoreEditOutline: ImageVector
    get() {
        if (_StoreEditOutline != null) {
            return _StoreEditOutline!!
        }
        _StoreEditOutline = ImageVector.Builder(
            name = "StoreEditOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 6f)
                horizontalLineTo(4f)
                verticalLineTo(4f)
                horizontalLineTo(20f)
                verticalLineTo(6f)
                moveTo(14f, 16.13f)
                lineTo(11f, 19.13f)
                verticalLineTo(20f)
                horizontalLineTo(4f)
                verticalLineTo(14f)
                horizontalLineTo(3f)
                verticalLineTo(12f)
                lineTo(4f, 7f)
                horizontalLineTo(20f)
                lineTo(20.61f, 10.07f)
                curveTo(20.16f, 10.17f, 19.73f, 10.4f, 19.39f, 10.74f)
                lineTo(18.82f, 11.31f)
                lineTo(18.36f, 9f)
                horizontalLineTo(5.64f)
                lineTo(5.04f, 12f)
                horizontalLineTo(18.13f)
                lineTo(16.13f, 14f)
                horizontalLineTo(14f)
                verticalLineTo(16.13f)
                moveTo(12f, 14f)
                horizontalLineTo(6f)
                verticalLineTo(18f)
                horizontalLineTo(12f)
                verticalLineTo(14f)
                moveTo(22.85f, 13.47f)
                lineTo(21.53f, 12.15f)
                curveTo(21.33f, 11.95f, 21f, 11.95f, 20.81f, 12.15f)
                lineTo(19.83f, 13.13f)
                lineTo(21.87f, 15.17f)
                lineTo(22.85f, 14.19f)
                curveTo(23.05f, 14f, 23.05f, 13.67f, 22.85f, 13.47f)
                moveTo(13f, 19.96f)
                verticalLineTo(22f)
                horizontalLineTo(15.04f)
                lineTo(21.17f, 15.88f)
                lineTo(19.13f, 13.83f)
                lineTo(13f, 19.96f)
                close()
            }
        }.build()

        return _StoreEditOutline!!
    }

@Suppress("ObjectPropertyName")
private var _StoreEditOutline: ImageVector? = null
