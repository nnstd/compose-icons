package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.RenameOutline: ImageVector
    get() {
        if (_RenameOutline != null) {
            return _RenameOutline!!
        }
        _RenameOutline = ImageVector.Builder(
            name = "RenameOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15f, 16f)
                lineTo(11f, 20f)
                horizontalLineTo(21f)
                verticalLineTo(16f)
                horizontalLineTo(15f)
                moveTo(12.06f, 7.19f)
                lineTo(3f, 16.25f)
                verticalLineTo(20f)
                horizontalLineTo(6.75f)
                lineTo(15.81f, 10.94f)
                lineTo(12.06f, 7.19f)
                moveTo(5.92f, 18f)
                horizontalLineTo(5f)
                verticalLineTo(17.08f)
                lineTo(12.06f, 10f)
                lineTo(13f, 10.94f)
                lineTo(5.92f, 18f)
                moveTo(18.71f, 8.04f)
                curveTo(19.1f, 7.65f, 19.1f, 7f, 18.71f, 6.63f)
                lineTo(16.37f, 4.29f)
                curveTo(16.17f, 4.09f, 15.92f, 4f, 15.66f, 4f)
                curveTo(15.41f, 4f, 15.15f, 4.1f, 14.96f, 4.29f)
                lineTo(13.13f, 6.12f)
                lineTo(16.88f, 9.87f)
                lineTo(18.71f, 8.04f)
                close()
            }
        }.build()

        return _RenameOutline!!
    }

@Suppress("ObjectPropertyName")
private var _RenameOutline: ImageVector? = null
