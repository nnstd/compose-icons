package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ContentSaveSettings: ImageVector
    get() {
        if (_ContentSaveSettings != null) {
            return _ContentSaveSettings!!
        }
        _ContentSaveSettings = ImageVector.Builder(
            name = "ContentSaveSettings",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15f, 8f)
                verticalLineTo(4f)
                horizontalLineTo(5f)
                verticalLineTo(8f)
                horizontalLineTo(15f)
                moveTo(12f, 18f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15f, 15f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 12f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 15f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 18f)
                moveTo(17f, 2f)
                lineTo(21f, 6f)
                verticalLineTo(18f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19f, 20f)
                horizontalLineTo(5f)
                curveTo(3.89f, 20f, 3f, 19.1f, 3f, 18f)
                verticalLineTo(4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 2f)
                horizontalLineTo(17f)
                moveTo(11f, 22f)
                horizontalLineTo(13f)
                verticalLineTo(24f)
                horizontalLineTo(11f)
                verticalLineTo(22f)
                moveTo(7f, 22f)
                horizontalLineTo(9f)
                verticalLineTo(24f)
                horizontalLineTo(7f)
                verticalLineTo(22f)
                moveTo(15f, 22f)
                horizontalLineTo(17f)
                verticalLineTo(24f)
                horizontalLineTo(15f)
                verticalLineTo(22f)
                close()
            }
        }.build()

        return _ContentSaveSettings!!
    }

@Suppress("ObjectPropertyName")
private var _ContentSaveSettings: ImageVector? = null
