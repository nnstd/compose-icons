package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BucketOutline: ImageVector
    get() {
        if (_BucketOutline != null) {
            return _BucketOutline!!
        }
        _BucketOutline = ImageVector.Builder(
            name = "BucketOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3f, 4f)
                horizontalLineTo(21f)
                verticalLineTo(7f)
                horizontalLineTo(20f)
                lineTo(17.5f, 21f)
                horizontalLineTo(6.5f)
                lineTo(4f, 7f)
                horizontalLineTo(3f)
                verticalLineTo(4f)
                moveTo(17.97f, 7f)
                horizontalLineTo(6.03f)
                lineTo(8.15f, 19f)
                horizontalLineTo(15.85f)
                lineTo(17.97f, 7f)
                close()
            }
        }.build()

        return _BucketOutline!!
    }

@Suppress("ObjectPropertyName")
private var _BucketOutline: ImageVector? = null
