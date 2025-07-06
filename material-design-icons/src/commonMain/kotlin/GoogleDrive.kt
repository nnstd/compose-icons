package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.GoogleDrive: ImageVector
    get() {
        if (_GoogleDrive != null) {
            return _GoogleDrive!!
        }
        _GoogleDrive = ImageVector.Builder(
            name = "GoogleDrive",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7.71f, 3.5f)
                lineTo(1.15f, 15f)
                lineTo(4.58f, 21f)
                lineTo(11.13f, 9.5f)
                moveTo(9.73f, 15f)
                lineTo(6.3f, 21f)
                horizontalLineTo(19.42f)
                lineTo(22.85f, 15f)
                moveTo(22.28f, 14f)
                lineTo(15.42f, 2f)
                horizontalLineTo(8.58f)
                lineTo(8.57f, 2f)
                lineTo(15.43f, 14f)
                horizontalLineTo(22.28f)
                close()
            }
        }.build()

        return _GoogleDrive!!
    }

@Suppress("ObjectPropertyName")
private var _GoogleDrive: ImageVector? = null
