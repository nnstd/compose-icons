package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.PhoneVoip: ImageVector
    get() {
        if (_PhoneVoip != null) {
            return _PhoneVoip!!
        }
        _PhoneVoip = ImageVector.Builder(
            name = "PhoneVoip",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 17f)
                verticalLineTo(19f)
                horizontalLineTo(14f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15f, 20f)
                horizontalLineTo(22f)
                verticalLineTo(22f)
                horizontalLineTo(15f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14f, 23f)
                horizontalLineTo(10f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9f, 22f)
                horizontalLineTo(2f)
                verticalLineTo(20f)
                horizontalLineTo(9f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10f, 19f)
                horizontalLineTo(11f)
                verticalLineTo(17f)
                horizontalLineTo(13f)
                moveTo(23.7f, 7.67f)
                curveTo(23.88f, 7.85f, 24f, 8.09f, 24f, 8.37f)
                curveTo(24f, 8.65f, 23.89f, 8.9f, 23.71f, 9.08f)
                lineTo(21.23f, 11.56f)
                curveTo(21.05f, 11.74f, 20.8f, 11.85f, 20.5f, 11.85f)
                curveTo(20.25f, 11.85f, 20f, 11.75f, 19.82f, 11.57f)
                curveTo(19f, 10.84f, 18.13f, 10.21f, 17.15f, 9.72f)
                curveTo(16.82f, 9.56f, 16.59f, 9.21f, 16.59f, 8.82f)
                verticalLineTo(5.72f)
                curveTo(15.14f, 5.25f, 13.59f, 5f, 12f, 5f)
                curveTo(10.4f, 5f, 8.85f, 5.25f, 7.4f, 5.73f)
                verticalLineTo(8.83f)
                curveTo(7.4f, 9.23f, 7.17f, 9.57f, 6.84f, 9.73f)
                curveTo(5.87f, 10.22f, 4.97f, 10.84f, 4.18f, 11.58f)
                curveTo(4f, 11.75f, 3.75f, 11.86f, 3.5f, 11.86f)
                curveTo(3.2f, 11.86f, 2.95f, 11.75f, 2.77f, 11.57f)
                lineTo(0.29f, 9.09f)
                curveTo(0.11f, 8.91f, 0f, 8.66f, 0f, 8.38f)
                curveTo(0f, 8.1f, 0.11f, 7.85f, 0.29f, 7.67f)
                curveTo(3.34f, 4.78f, 7.46f, 3f, 12f, 3f)
                curveTo(16.53f, 3f, 20.65f, 4.78f, 23.7f, 7.67f)
                moveTo(11f, 10f)
                verticalLineTo(15f)
                horizontalLineTo(10f)
                verticalLineTo(10f)
                horizontalLineTo(11f)
                moveTo(12f, 10f)
                horizontalLineTo(15f)
                verticalLineTo(13f)
                horizontalLineTo(13f)
                verticalLineTo(15f)
                horizontalLineTo(12f)
                verticalLineTo(10f)
                moveTo(14f, 12f)
                verticalLineTo(11f)
                horizontalLineTo(13f)
                verticalLineTo(12f)
                horizontalLineTo(14f)
                close()
            }
        }.build()

        return _PhoneVoip!!
    }

@Suppress("ObjectPropertyName")
private var _PhoneVoip: ImageVector? = null
