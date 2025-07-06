package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.DatabaseEdit: ImageVector
    get() {
        if (_DatabaseEdit != null) {
            return _DatabaseEdit!!
        }
        _DatabaseEdit = ImageVector.Builder(
            name = "DatabaseEdit",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4f, 14f)
                verticalLineTo(17f)
                curveTo(4f, 19f, 7.05f, 20.72f, 11f, 21f)
                verticalLineTo(18.11f)
                lineTo(11.13f, 18f)
                curveTo(7.12f, 17.76f, 4f, 16.06f, 4f, 14f)
                moveTo(12f, 13f)
                curveTo(7.58f, 13f, 4f, 11.21f, 4f, 9f)
                verticalLineTo(12f)
                curveTo(4f, 14.21f, 7.58f, 16f, 12f, 16f)
                curveTo(12.39f, 16f, 12.77f, 16f, 13.16f, 16f)
                lineTo(17f, 12.12f)
                curveTo(15.4f, 12.72f, 13.71f, 13f, 12f, 13f)
                moveTo(12f, 3f)
                curveTo(7.58f, 3f, 4f, 4.79f, 4f, 7f)
                curveTo(4f, 9.21f, 7.58f, 11f, 12f, 11f)
                curveTo(16.42f, 11f, 20f, 9.21f, 20f, 7f)
                curveTo(20f, 4.79f, 16.42f, 3f, 12f, 3f)
                moveTo(21f, 11.13f)
                curveTo(20.85f, 11.13f, 20.71f, 11.19f, 20.61f, 11.3f)
                lineTo(19.61f, 12.3f)
                lineTo(21.66f, 14.3f)
                lineTo(22.66f, 13.3f)
                curveTo(22.87f, 13.1f, 22.88f, 12.76f, 22.66f, 12.53f)
                lineTo(21.42f, 11.3f)
                curveTo(21.32f, 11.19f, 21.18f, 11.13f, 21.04f, 11.13f)
                moveTo(19.04f, 12.88f)
                lineTo(13f, 18.94f)
                verticalLineTo(21f)
                horizontalLineTo(15.06f)
                lineTo(21.12f, 14.93f)
                lineTo(19.04f, 12.88f)
                close()
            }
        }.build()

        return _DatabaseEdit!!
    }

@Suppress("ObjectPropertyName")
private var _DatabaseEdit: ImageVector? = null
