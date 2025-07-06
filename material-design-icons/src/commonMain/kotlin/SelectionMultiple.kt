package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.SelectionMultiple: ImageVector
    get() {
        if (_SelectionMultiple != null) {
            return _SelectionMultiple!!
        }
        _SelectionMultiple = ImageVector.Builder(
            name = "SelectionMultiple",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11f, 6f)
                verticalLineTo(4f)
                horizontalLineTo(15f)
                verticalLineTo(6f)
                horizontalLineTo(11f)
                moveTo(6f, 9f)
                horizontalLineTo(8f)
                verticalLineTo(13f)
                horizontalLineTo(6f)
                verticalLineTo(9f)
                moveTo(6f, 6f)
                curveTo(6f, 4.89f, 6.9f, 4f, 8f, 4f)
                horizontalLineTo(9f)
                verticalLineTo(6f)
                horizontalLineTo(8f)
                verticalLineTo(7f)
                horizontalLineTo(6f)
                verticalLineTo(6f)
                moveTo(8f, 18f)
                curveTo(6.89f, 18f, 6f, 17.1f, 6f, 16f)
                verticalLineTo(15f)
                horizontalLineTo(8f)
                verticalLineTo(16f)
                horizontalLineTo(9f)
                verticalLineTo(18f)
                horizontalLineTo(8f)
                moveTo(18f, 4f)
                curveTo(19.11f, 4f, 20f, 4.9f, 20f, 6f)
                verticalLineTo(7f)
                horizontalLineTo(18f)
                verticalLineTo(6f)
                horizontalLineTo(17f)
                verticalLineTo(4f)
                horizontalLineTo(18f)
                moveTo(15f, 16f)
                verticalLineTo(18f)
                horizontalLineTo(11f)
                verticalLineTo(16f)
                horizontalLineTo(15f)
                moveTo(20f, 13f)
                horizontalLineTo(18f)
                verticalLineTo(9f)
                horizontalLineTo(20f)
                verticalLineTo(13f)
                moveTo(20f, 16f)
                curveTo(20f, 17.11f, 19.1f, 18f, 18f, 18f)
                horizontalLineTo(17f)
                verticalLineTo(16f)
                horizontalLineTo(18f)
                verticalLineTo(15f)
                horizontalLineTo(20f)
                verticalLineTo(16f)
                moveTo(3f, 8f)
                horizontalLineTo(4f)
                verticalLineTo(20f)
                horizontalLineTo(16f)
                verticalLineTo(21f)
                curveTo(16f, 21.54f, 15.57f, 22f, 15.03f, 22f)
                horizontalLineTo(15f)
                lineTo(3f, 22f)
                curveTo(2.45f, 22f, 2f, 21.55f, 2f, 21f)
                verticalLineTo(9f)
                curveTo(2f, 8.45f, 2.45f, 8f, 3f, 8f)
                close()
            }
        }.build()

        return _SelectionMultiple!!
    }

@Suppress("ObjectPropertyName")
private var _SelectionMultiple: ImageVector? = null
