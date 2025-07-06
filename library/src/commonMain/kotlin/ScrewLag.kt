package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ScrewLag: ImageVector
    get() {
        if (_ScrewLag != null) {
            return _ScrewLag!!
        }
        _ScrewLag = ImageVector.Builder(
            name = "ScrewLag",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10f, 19.3f)
                lineTo(14f, 16.6f)
                verticalLineTo(20f)
                lineTo(12f, 22f)
                lineTo(10f, 20f)
                verticalLineTo(19.3f)
                moveTo(14f, 12.7f)
                lineTo(10f, 15.4f)
                verticalLineTo(17.4f)
                lineTo(9f, 18f)
                verticalLineTo(19f)
                lineTo(15f, 15.1f)
                verticalLineTo(14f)
                lineTo(14f, 14.7f)
                verticalLineTo(12.7f)
                moveTo(7f, 2f)
                verticalLineTo(5f)
                horizontalLineTo(17f)
                verticalLineTo(2f)
                horizontalLineTo(7f)
                moveTo(9f, 6f)
                verticalLineTo(9f)
                lineTo(10f, 9.7f)
                verticalLineTo(13.4f)
                lineTo(9f, 14f)
                verticalLineTo(15f)
                lineTo(15f, 11.1f)
                verticalLineTo(10f)
                lineTo(14f, 10.7f)
                curveTo(14f, 10.7f, 14f, 10.3f, 14f, 9.7f)
                lineTo(15f, 9f)
                verticalLineTo(6f)
                horizontalLineTo(9f)
                close()
            }
        }.build()

        return _ScrewLag!!
    }

@Suppress("ObjectPropertyName")
private var _ScrewLag: ImageVector? = null
