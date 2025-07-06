package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FileRestoreOutline: ImageVector
    get() {
        if (_FileRestoreOutline != null) {
            return _FileRestoreOutline!!
        }
        _FileRestoreOutline = ImageVector.Builder(
            name = "FileRestoreOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14f, 2f)
                horizontalLineTo(6f)
                curveTo(4.9f, 2f, 4f, 2.9f, 4f, 4f)
                verticalLineTo(20f)
                curveTo(4f, 21.1f, 4.9f, 22f, 6f, 22f)
                horizontalLineTo(18f)
                curveTo(19.1f, 22f, 20f, 21.1f, 20f, 20f)
                verticalLineTo(8f)
                lineTo(14f, 2f)
                moveTo(18f, 20f)
                horizontalLineTo(6f)
                verticalLineTo(4f)
                horizontalLineTo(13f)
                lineTo(18f, 9f)
                verticalLineTo(20f)
                moveTo(17f, 13.24f)
                curveTo(17f, 15.86f, 14.87f, 18f, 12.24f, 18f)
                curveTo(10.29f, 18f, 8.61f, 16.82f, 7.88f, 15.14f)
                horizontalLineTo(9.5f)
                curveTo(10.11f, 16f, 11.11f, 16.57f, 12.24f, 16.57f)
                curveTo(14.08f, 16.57f, 15.57f, 15.07f, 15.57f, 13.24f)
                reflectiveCurveTo(14.08f, 9.9f, 12.24f, 9.9f)
                curveTo(10.95f, 9.9f, 9.86f, 10.65f, 9.29f, 11.71f)
                lineTo(10.81f, 13.24f)
                horizontalLineTo(7f)
                verticalLineTo(9.43f)
                lineTo(8.24f, 10.67f)
                curveTo(9.09f, 9.35f, 10.55f, 8.5f, 12.24f, 8.5f)
                curveTo(14.87f, 8.47f, 17f, 10.61f, 17f, 13.24f)
                close()
            }
        }.build()

        return _FileRestoreOutline!!
    }

@Suppress("ObjectPropertyName")
private var _FileRestoreOutline: ImageVector? = null
