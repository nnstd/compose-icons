package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FilterOffOutline: ImageVector
    get() {
        if (_FilterOffOutline != null) {
            return _FilterOffOutline!!
        }
        _FilterOffOutline = ImageVector.Builder(
            name = "FilterOffOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2.39f, 1.73f)
                lineTo(1.11f, 3f)
                lineTo(9f, 10.89f)
                verticalLineTo(15.87f)
                curveTo(8.96f, 16.16f, 9.06f, 16.47f, 9.29f, 16.7f)
                lineTo(13.3f, 20.71f)
                curveTo(13.69f, 21.1f, 14.32f, 21.1f, 14.71f, 20.71f)
                curveTo(14.94f, 20.5f, 15.04f, 20.18f, 15f, 19.88f)
                verticalLineTo(16.89f)
                lineTo(20.84f, 22.73f)
                lineTo(22.11f, 21.46f)
                lineTo(15f, 14.35f)
                verticalLineTo(14.34f)
                lineTo(13f, 12.35f)
                lineTo(11f, 10.34f)
                lineTo(4.15f, 3.5f)
                lineTo(2.39f, 1.73f)
                moveTo(6.21f, 3f)
                lineTo(8.2f, 5f)
                horizontalLineTo(16.96f)
                lineTo(13.11f, 9.91f)
                lineTo(15f, 11.8f)
                verticalLineTo(10.75f)
                lineTo(19.79f, 4.62f)
                curveTo(20.13f, 4.19f, 20.05f, 3.56f, 19.62f, 3.22f)
                curveTo(19.43f, 3.08f, 19.22f, 3f, 19f, 3f)
                horizontalLineTo(6.21f)
                moveTo(11f, 12.89f)
                lineTo(13f, 14.89f)
                verticalLineTo(17.58f)
                lineTo(11f, 15.58f)
                verticalLineTo(12.89f)
                close()
            }
        }.build()

        return _FilterOffOutline!!
    }

@Suppress("ObjectPropertyName")
private var _FilterOffOutline: ImageVector? = null
