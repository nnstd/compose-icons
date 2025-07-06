package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.UnderwearOutline: ImageVector
    get() {
        if (_UnderwearOutline != null) {
            return _UnderwearOutline!!
        }
        _UnderwearOutline = ImageVector.Builder(
            name = "UnderwearOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3f, 4f)
                curveTo(2.45f, 4f, 2f, 4.45f, 2f, 5f)
                verticalLineTo(10f)
                curveTo(2f, 15.5f, 6.5f, 20f, 12f, 20f)
                curveTo(17.5f, 20f, 22f, 15.5f, 22f, 10f)
                verticalLineTo(5f)
                curveTo(22f, 4.45f, 21.55f, 4f, 21f, 4f)
                horizontalLineTo(3f)
                moveTo(20f, 6f)
                verticalLineTo(8f)
                horizontalLineTo(4f)
                verticalLineTo(6f)
                horizontalLineTo(20f)
                moveTo(4f, 10f)
                horizontalLineTo(20f)
                curveTo(20f, 10.34f, 20f, 10.67f, 19.94f, 11f)
                curveTo(16.12f, 11.03f, 13.03f, 14.12f, 13f, 17.94f)
                curveTo(12.67f, 18f, 12.34f, 18f, 12f, 18f)
                curveTo(11.66f, 18f, 11.33f, 18f, 11f, 17.94f)
                curveTo(10.97f, 14.12f, 7.88f, 11.03f, 4.06f, 11f)
                curveTo(4f, 10.67f, 4f, 10.34f, 4f, 10f)
                moveTo(15.04f, 17.4f)
                curveTo(15.31f, 15.12f, 17.12f, 13.31f, 19.41f, 13.04f)
                curveTo(18.59f, 15f, 17f, 16.59f, 15.03f, 17.41f)
                moveTo(4.6f, 13.04f)
                curveTo(6.88f, 13.31f, 8.7f, 15.12f, 8.97f, 17.41f)
                curveTo(7f, 16.59f, 5.41f, 15f, 4.6f, 13.03f)
                close()
            }
        }.build()

        return _UnderwearOutline!!
    }

@Suppress("ObjectPropertyName")
private var _UnderwearOutline: ImageVector? = null
